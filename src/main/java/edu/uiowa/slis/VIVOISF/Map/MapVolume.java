package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(MapVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapVolumeIterator theMap = (MapVolumeIterator)findAncestorWithClass(this, MapVolumeIterator.class);
			pageContext.getOut().print(theMap.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for volume tag ");
		}
		return SKIP_BODY;
	}
}

