package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationIAO_0000136Iterator theLocationIAO_0000136Iterator = (LocationIAO_0000136Iterator)findAncestorWithClass(this, LocationIAO_0000136Iterator.class);
			pageContext.getOut().print(theLocationIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

