package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNationalityZHIterator theArea = (AreaNationalityZHIterator)findAncestorWithClass(this, AreaNationalityZHIterator.class);
			pageContext.getOut().print(theArea.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

