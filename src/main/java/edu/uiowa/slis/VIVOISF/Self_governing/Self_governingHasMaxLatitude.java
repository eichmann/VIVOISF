package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingHasMaxLatitudeIterator theSelf_governing = (Self_governingHasMaxLatitudeIterator)findAncestorWithClass(this, Self_governingHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theSelf_governing.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

