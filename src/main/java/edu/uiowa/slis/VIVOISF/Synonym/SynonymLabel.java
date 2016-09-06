package edu.uiowa.slis.VIVOISF.Synonym;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Synonym theSynonym = (Synonym)findAncestorWithClass(this, Synonym.class);
			if (!theSynonym.commitNeeded) {
				pageContext.getOut().print(theSynonym.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Synonym theSynonym = (Synonym)findAncestorWithClass(this, Synonym.class);
			return theSynonym.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Synonym for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Synonym theSynonym = (Synonym)findAncestorWithClass(this, Synonym.class);
			theSynonym.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for label tag ");
		}
	}
}

