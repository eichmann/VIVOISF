package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityAgriculturalAreaYearIterator theGeopoliticalEntity = (GeopoliticalEntityAgriculturalAreaYearIterator)findAncestorWithClass(this, GeopoliticalEntityAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

