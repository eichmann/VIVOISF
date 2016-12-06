package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNationalityITIterator theGeopoliticalEntity = (GeopoliticalEntityNationalityITIterator)findAncestorWithClass(this, GeopoliticalEntityNationalityITIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

