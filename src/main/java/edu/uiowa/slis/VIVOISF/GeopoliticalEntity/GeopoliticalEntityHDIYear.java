package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHDIYearIterator theGeopoliticalEntity = (GeopoliticalEntityHDIYearIterator)findAncestorWithClass(this, GeopoliticalEntityHDIYearIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

