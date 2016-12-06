package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasSubjectAreaIterator theLocationHasSubjectAreaIterator = (LocationHasSubjectAreaIterator)findAncestorWithClass(this, LocationHasSubjectAreaIterator.class);
			pageContext.getOut().print(theLocationHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

