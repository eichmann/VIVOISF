package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqValueInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqValueInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqValueInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqValueInverseIterator theSeqValueInverseIterator = (SeqValueInverseIterator)findAncestorWithClass(this, SeqValueInverseIterator.class);
			pageContext.getOut().print(theSeqValueInverseIterator.getValueInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for value tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for value tag ");
		}
		return SKIP_BODY;
	}
}

