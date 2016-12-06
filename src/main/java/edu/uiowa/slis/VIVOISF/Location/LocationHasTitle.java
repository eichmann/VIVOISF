package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasTitleIterator theLocationHasTitleIterator = (LocationHasTitleIterator)findAncestorWithClass(this, LocationHasTitleIterator.class);
			pageContext.getOut().print(theLocationHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

