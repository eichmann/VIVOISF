package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingHasMinLongitudeIterator theSelf_governing = (Self_governingHasMinLongitudeIterator)findAncestorWithClass(this, Self_governingHasMinLongitudeIterator.class);
			pageContext.getOut().print(theSelf_governing.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

