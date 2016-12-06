package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNationalityZHIterator thePosition = (PositionNationalityZHIterator)findAncestorWithClass(this, PositionNationalityZHIterator.class);
			pageContext.getOut().print(thePosition.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

