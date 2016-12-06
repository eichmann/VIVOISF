package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNationalityZHIterator thePrimaryPosition = (PrimaryPositionNationalityZHIterator)findAncestorWithClass(this, PrimaryPositionNationalityZHIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

