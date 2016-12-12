package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingPopulationYearIterator theSelf_governing = (Self_governingPopulationYearIterator)findAncestorWithClass(this, Self_governingPopulationYearIterator.class);
			pageContext.getOut().print(theSelf_governing.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

