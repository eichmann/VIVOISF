package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNationalityZHIterator theThing = (ThingNationalityZHIterator)findAncestorWithClass(this, ThingNationalityZHIterator.class);
			pageContext.getOut().print(theThing.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

