package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023NationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023NationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023NationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023NationalityZHIterator theBFO_0000023 = (BFO_0000023NationalityZHIterator)findAncestorWithClass(this, BFO_0000023NationalityZHIterator.class);
			pageContext.getOut().print(theBFO_0000023.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

