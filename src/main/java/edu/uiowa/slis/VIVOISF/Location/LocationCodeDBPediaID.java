package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeDBPediaIDIterator theLocation = (LocationCodeDBPediaIDIterator)findAncestorWithClass(this, LocationCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theLocation.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

