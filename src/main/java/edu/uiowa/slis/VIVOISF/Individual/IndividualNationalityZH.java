package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNationalityZHIterator theIndividual = (IndividualNationalityZHIterator)findAncestorWithClass(this, IndividualNationalityZHIterator.class);
			pageContext.getOut().print(theIndividual.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

