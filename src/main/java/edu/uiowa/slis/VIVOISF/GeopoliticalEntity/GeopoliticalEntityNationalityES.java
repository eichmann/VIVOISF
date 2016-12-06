package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNationalityESIterator theGeopoliticalEntity = (GeopoliticalEntityNationalityESIterator)findAncestorWithClass(this, GeopoliticalEntityNationalityESIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

