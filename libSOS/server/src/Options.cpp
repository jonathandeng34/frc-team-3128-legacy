/*
 * Options.cpp
 *
 *  Created on: Dec 3, 2013
 *      Author: jamie
 */

#include <Options.h>
#include "Configuration.h"

Options::Options()
:_port(SOCKET_PORT),
 _crio_port(CRIO_PORT),
_fake(false),
#ifdef MAKE_ROBOT_COMMANDS
_verbose(true), //this can be set in the config file or specified via command line
#else
_verbose(false),
#endif
_returnCodeRegistry()
{

}

Options & Options::instance()
{
	static Options instanceObject;

	return instanceObject;
}
