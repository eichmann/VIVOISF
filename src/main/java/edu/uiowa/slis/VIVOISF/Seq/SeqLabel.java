package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Seq theSeq = (Seq)findAncestorWithClass(this, Seq.class);
			if (!theSeq.commitNeeded) {
				pageContext.getOut().print(theSeq.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Seq theSeq = (Seq)findAncestorWithClass(this, Seq.class);
			return theSeq.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Seq for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Seq theSeq = (Seq)findAncestorWithClass(this, Seq.class);
			theSeq.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for label tag ");
		}
	}
}

