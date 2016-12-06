package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasResearchAreaIterator theLocationHasResearchAreaIterator = (LocationHasResearchAreaIterator)findAncestorWithClass(this, LocationHasResearchAreaIterator.class);
			pageContext.getOut().print(theLocationHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

