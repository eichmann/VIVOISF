package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingLandAreaUnitIterator theSelf_governing = (Self_governingLandAreaUnitIterator)findAncestorWithClass(this, Self_governingLandAreaUnitIterator.class);
			pageContext.getOut().print(theSelf_governing.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

