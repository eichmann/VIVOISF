package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MapIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapIAO_0000136Iterator theMapIAO_0000136Iterator = (MapIAO_0000136Iterator)findAncestorWithClass(this, MapIAO_0000136Iterator.class);
			pageContext.getOut().print(theMapIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

