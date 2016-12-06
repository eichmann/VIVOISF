package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNationalityZHIterator theterritory = (territoryNationalityZHIterator)findAncestorWithClass(this, territoryNationalityZHIterator.class);
			pageContext.getOut().print(theterritory.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

