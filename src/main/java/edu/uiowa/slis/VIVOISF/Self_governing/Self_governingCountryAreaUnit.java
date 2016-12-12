package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCountryAreaUnitIterator theSelf_governing = (Self_governingCountryAreaUnitIterator)findAncestorWithClass(this, Self_governingCountryAreaUnitIterator.class);
			pageContext.getOut().print(theSelf_governing.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

