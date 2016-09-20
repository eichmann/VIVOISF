package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasMemberInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasMemberInverseIterator theLocationHasMemberInverseIterator = (LocationHasMemberInverseIterator)findAncestorWithClass(this, LocationHasMemberInverseIterator.class);
			pageContext.getOut().print(theLocationHasMemberInverseIterator.getHasMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

