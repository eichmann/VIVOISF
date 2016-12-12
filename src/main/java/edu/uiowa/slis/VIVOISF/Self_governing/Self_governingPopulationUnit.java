package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingPopulationUnitIterator theSelf_governing = (Self_governingPopulationUnitIterator)findAncestorWithClass(this, Self_governingPopulationUnitIterator.class);
			pageContext.getOut().print(theSelf_governing.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

