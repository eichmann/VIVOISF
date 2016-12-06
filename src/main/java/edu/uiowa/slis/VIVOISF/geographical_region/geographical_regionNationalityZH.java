package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNationalityZHIterator thegeographical_region = (geographical_regionNationalityZHIterator)findAncestorWithClass(this, geographical_regionNationalityZHIterator.class);
			pageContext.getOut().print(thegeographical_region.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}
