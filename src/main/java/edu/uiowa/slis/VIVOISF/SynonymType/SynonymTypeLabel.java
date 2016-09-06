package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SynonymType theSynonymType = (SynonymType)findAncestorWithClass(this, SynonymType.class);
			if (!theSynonymType.commitNeeded) {
				pageContext.getOut().print(theSynonymType.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			SynonymType theSynonymType = (SynonymType)findAncestorWithClass(this, SynonymType.class);
			return theSynonymType.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing SynonymType for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			SynonymType theSynonymType = (SynonymType)findAncestorWithClass(this, SynonymType.class);
			theSynonymType.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for label tag ");
		}
	}
}

