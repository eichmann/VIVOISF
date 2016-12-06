package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNationalityZHIterator theGeographicLocation = (GeographicLocationNationalityZHIterator)findAncestorWithClass(this, GeographicLocationNationalityZHIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

