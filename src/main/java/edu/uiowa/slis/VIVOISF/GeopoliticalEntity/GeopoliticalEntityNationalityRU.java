package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNationalityRUIterator theGeopoliticalEntity = (GeopoliticalEntityNationalityRUIterator)findAncestorWithClass(this, GeopoliticalEntityNationalityRUIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

