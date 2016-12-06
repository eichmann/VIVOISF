package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNationalityFRIterator theGeopoliticalEntity = (GeopoliticalEntityNationalityFRIterator)findAncestorWithClass(this, GeopoliticalEntityNationalityFRIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

