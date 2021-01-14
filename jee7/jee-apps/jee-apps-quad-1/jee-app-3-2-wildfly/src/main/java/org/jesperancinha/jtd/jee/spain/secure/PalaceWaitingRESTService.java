package org.jesperancinha.jtd.jee.spain.secure;

import org.jesperancinha.console.consolerizer.Consolerizer;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;
import java.util.Objects;

@Path("/history/palace/rest")
@RequestScoped
public class PalaceWaitingRESTService implements Serializable {

    @EJB
    private PalaceWaitingRoom palaceWaitingRoom;

    @EJB
    private PalaceSessionWaitingRoom palaceSessionWaitingRoom;

    @EJB
    private ContextProvider contextProvider;

    public PalaceWaitingRESTService() {
        Consolerizer.setupFastDefault();
        if (Objects.isNull(contextProvider)) {
            Consolerizer.printYellowGenericLn(
                "In the constructor, injection points are usually %s. This was the Palace value", palaceWaitingRoom);
            Consolerizer.printYellowGenericLn("%s this was the ContextProvider value", contextProvider);
            Consolerizer.printYellowGenericLn("%s this was the palaceSessionWaitingRoom value", palaceSessionWaitingRoom);
        }
    }

    @GET
    @Path("palace")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed({ "Trastamara" })
    public String palaceName() {
        palaceWaitingRoom.getContextProvider().getContext().isCallerInRole("Manager");
        palaceWaitingRoom.isUserInRole("Manager");
        Consolerizer.printBlueGenericLn("Notice that we can now acceas the session and check.");
        Consolerizer.printBlueGenericLn("This means that current user does not have role Manager -> %s",
            contextProvider.getContext()
                .isCallerInRole("Manager"));
        palaceSessionWaitingRoom.isUserInRole("Manager");
        return "Palacio Real de Valsain";
    }
}
