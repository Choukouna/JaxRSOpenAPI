/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.istic.taa.jaxrs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application; //sample-simple

import fr.istic.taa.jaxrs.rest.PetResource;
import fr.istic.taa.jaxrs.rest.SwaggerResource;
import fr.istic.taa.jaxrs.rest.UserResource;
import fr.istic.taa.jaxrs.rest.CardResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;

@ApplicationPath("/")
public class TestApplication extends Application {


    @Override
    public Set<Class<?>> getClasses() {

        final Set<Class<?>> clazzes = new HashSet<Class<?>>();
        //Ressource Pet pour décrire la construction d'une api rest
        clazzes.add(PetResource.class);
        //Ressource openapi
        clazzes.add(OpenApiResource.class);

        //ajout de la ressource user à l'app et de la card
        clazzes.add(UserResource.class);
        clazzes.add(CardResource.class);

        //add swagger resource
        clazzes.add(SwaggerResource.class);
        return clazzes;
    }

}
