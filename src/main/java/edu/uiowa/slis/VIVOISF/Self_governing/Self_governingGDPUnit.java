package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingGDPUnitIterator theSelf_governing = (Self_governingGDPUnitIterator)findAncestorWithClass(this, Self_governingGDPUnitIterator.class);
			pageContext.getOut().print(theSelf_governing.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

