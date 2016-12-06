package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentAgriculturalAreaTotalIterator theContinent = (ContinentAgriculturalAreaTotalIterator)findAncestorWithClass(this, ContinentAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theContinent.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

