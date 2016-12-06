package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityGDPUnitIterator theGeopoliticalEntity = (GeopoliticalEntityGDPUnitIterator)findAncestorWithClass(this, GeopoliticalEntityGDPUnitIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

