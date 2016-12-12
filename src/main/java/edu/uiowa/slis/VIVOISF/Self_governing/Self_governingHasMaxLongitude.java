package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingHasMaxLongitudeIterator theSelf_governing = (Self_governingHasMaxLongitudeIterator)findAncestorWithClass(this, Self_governingHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theSelf_governing.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

