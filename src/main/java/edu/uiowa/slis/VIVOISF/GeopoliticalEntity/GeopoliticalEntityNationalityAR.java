package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNationalityARIterator theGeopoliticalEntity = (GeopoliticalEntityNationalityARIterator)findAncestorWithClass(this, GeopoliticalEntityNationalityARIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

