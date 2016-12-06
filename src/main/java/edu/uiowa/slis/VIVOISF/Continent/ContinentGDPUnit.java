package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentGDPUnitIterator theContinent = (ContinentGDPUnitIterator)findAncestorWithClass(this, ContinentGDPUnitIterator.class);
			pageContext.getOut().print(theContinent.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

