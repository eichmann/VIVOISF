package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasMemberInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasMemberInverseIterator theIndividualHasMemberInverseIterator = (IndividualHasMemberInverseIterator)findAncestorWithClass(this, IndividualHasMemberInverseIterator.class);
			pageContext.getOut().print(theIndividualHasMemberInverseIterator.getHasMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

