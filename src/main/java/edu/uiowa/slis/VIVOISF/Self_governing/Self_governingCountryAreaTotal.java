package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCountryAreaTotalIterator theSelf_governing = (Self_governingCountryAreaTotalIterator)findAncestorWithClass(this, Self_governingCountryAreaTotalIterator.class);
			pageContext.getOut().print(theSelf_governing.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

