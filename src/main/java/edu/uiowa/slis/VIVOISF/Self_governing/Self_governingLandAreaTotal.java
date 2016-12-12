package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingLandAreaTotalIterator theSelf_governing = (Self_governingLandAreaTotalIterator)findAncestorWithClass(this, Self_governingLandAreaTotalIterator.class);
			pageContext.getOut().print(theSelf_governing.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

