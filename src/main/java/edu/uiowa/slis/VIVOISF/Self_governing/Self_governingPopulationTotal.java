package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingPopulationTotalIterator theSelf_governing = (Self_governingPopulationTotalIterator)findAncestorWithClass(this, Self_governingPopulationTotalIterator.class);
			pageContext.getOut().print(theSelf_governing.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

