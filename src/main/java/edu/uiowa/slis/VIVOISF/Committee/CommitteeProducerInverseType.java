package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeProducerInverseIterator theCommitteeProducerInverseIterator = (CommitteeProducerInverseIterator)findAncestorWithClass(this, CommitteeProducerInverseIterator.class);
			pageContext.getOut().print(theCommitteeProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for producer tag ");
		}
		return SKIP_BODY;
	}
}

