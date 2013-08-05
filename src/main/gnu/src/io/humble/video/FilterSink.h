/*******************************************************************************
 * Copyright (c) 2013, Art Clarke.  All rights reserved.
 *  
 * This file is part of Humble-Video.
 *
 * Humble-Video is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Humble-Video is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Humble-Video.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
/*
 * FilterSink.h
 *
 *  Created on: Aug 5, 2013
 *      Author: aclarke
 */

#ifndef FILTERSINK_H_
#define FILTERSINK_H_

#include <io/humble/video/FilterEndPoint.h>

namespace io {
namespace humble {
namespace video {

/**
 * A sink of {@link MediaRaw} objects for a {@link FilterGraph}.
 */
class FilterSink : public io::humble::video::FilterEndPoint
{
protected:
  FilterSink();
  virtual
  ~FilterSink();
};

} /* namespace video */
} /* namespace humble */
} /* namespace io */
#endif /* FILTERSINK_H_ */