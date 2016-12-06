package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryAgriculturalAreaUnitIterator theterritory = (territoryAgriculturalAreaUnitIterator)findAncestorWithClass(this, territoryAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theterritory.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

