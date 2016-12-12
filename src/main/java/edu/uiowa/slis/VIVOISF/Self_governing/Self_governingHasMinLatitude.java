package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingHasMinLatitudeIterator theSelf_governing = (Self_governingHasMinLatitudeIterator)findAncestorWithClass(this, Self_governingHasMinLatitudeIterator.class);
			pageContext.getOut().print(theSelf_governing.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

