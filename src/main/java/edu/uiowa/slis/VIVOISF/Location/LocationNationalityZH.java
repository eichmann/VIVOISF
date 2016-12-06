package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNationalityZHIterator theLocation = (LocationNationalityZHIterator)findAncestorWithClass(this, LocationNationalityZHIterator.class);
			pageContext.getOut().print(theLocation.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

