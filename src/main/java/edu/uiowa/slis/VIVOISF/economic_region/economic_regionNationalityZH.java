package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNationalityZHIterator theeconomic_region = (economic_regionNationalityZHIterator)findAncestorWithClass(this, economic_regionNationalityZHIterator.class);
			pageContext.getOut().print(theeconomic_region.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

