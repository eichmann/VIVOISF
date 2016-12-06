package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityGDPYearIterator theGeopoliticalEntity = (GeopoliticalEntityGDPYearIterator)findAncestorWithClass(this, GeopoliticalEntityGDPYearIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

