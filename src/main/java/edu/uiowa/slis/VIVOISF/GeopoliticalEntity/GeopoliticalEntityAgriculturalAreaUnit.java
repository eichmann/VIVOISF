package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityAgriculturalAreaUnitIterator theGeopoliticalEntity = (GeopoliticalEntityAgriculturalAreaUnitIterator)findAncestorWithClass(this, GeopoliticalEntityAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

