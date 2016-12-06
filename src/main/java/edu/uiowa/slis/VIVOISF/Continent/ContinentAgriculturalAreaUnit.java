package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentAgriculturalAreaUnitIterator theContinent = (ContinentAgriculturalAreaUnitIterator)findAncestorWithClass(this, ContinentAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theContinent.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

